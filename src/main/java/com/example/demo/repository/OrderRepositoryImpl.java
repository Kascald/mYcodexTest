package com.example.demo.repository;

import com.example.demo.dto.OrderProjection;
import com.example.demo.entity.Order;
import com.example.demo.entity.QCustomer;
import com.example.demo.entity.QOrder;
import com.example.demo.entity.QOrderItem;
import com.example.demo.entity.QRecipient;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public OrderRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public List<OrderProjection> findOrderWithRelations() {
        QOrder order = QOrder.order;
        QCustomer customer = QCustomer.customer;
        QOrderItem orderItem = QOrderItem.orderItem;
        QRecipient recipient = QRecipient.recipient;

        return queryFactory
                .select(Projections.constructor(OrderProjection.class,
                        order.id,
                        customer.id,
                        customer.name,
                        recipient.id,
                        recipient.address))
                .from(order)
                .join(order.customer, customer)
                .leftJoin(order.orderItems, orderItem)
                .leftJoin(order.recipient, recipient)
                .fetch();
    }
}
