package com.hexpay.membership.application.port.in;

import com.hexpay.membership.domain.Membership;
import common.UseCase;

@UseCase
public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
