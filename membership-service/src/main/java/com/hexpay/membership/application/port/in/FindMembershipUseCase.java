package com.hexpay.membership.application.port.in;

import com.hexpay.membership.domain.Membership;

public interface FindMembershipUseCase {

    Membership findMembership(FindMembershipCommand command);
}
