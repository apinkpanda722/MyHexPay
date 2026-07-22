package com.hexpay.membership.application.port.out;

import com.hexpay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.hexpay.membership.domain.Membership;

public interface FindMembershipPort {

    MembershipJpaEntity findMembership(
            Membership.MembershipId membershipId
    );
}
