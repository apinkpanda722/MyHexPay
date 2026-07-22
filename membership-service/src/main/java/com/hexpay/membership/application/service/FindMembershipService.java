package com.hexpay.membership.application.service;

import com.hexpay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.hexpay.membership.adapter.out.persistence.MembershipMapper;
import com.hexpay.membership.application.port.in.FindMembershipCommand;
import com.hexpay.membership.application.port.in.FindMembershipUseCase;
import com.hexpay.membership.application.port.out.FindMembershipPort;
import com.hexpay.membership.domain.Membership;
import common.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@RequiredArgsConstructor
@Transactional
public class FindMembershipService implements FindMembershipUseCase {

    private final FindMembershipPort findMembershipPort;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership findMembership(FindMembershipCommand command) {
        MembershipJpaEntity jpaEntity = findMembershipPort.findMembership(new Membership.MembershipId(command.getMembershipId()));
        return membershipMapper.mapToDomainEntity(jpaEntity);
    }
}
