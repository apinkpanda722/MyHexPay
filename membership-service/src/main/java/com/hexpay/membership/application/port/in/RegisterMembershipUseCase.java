package com.hexpay.membership.application.port.in;

import com.hexpay.membership.domain.Membership;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
