package org.rest.sec.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.rest.common.client.template.IEntityOperations;
import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

@Component
public final class RoleEntityOpsImpl implements IEntityOperations<Role> {

    public RoleEntityOpsImpl() {
        super();
    }

    // API

    @Override
    public final Role createNewEntity() {
        return new Role(randomAlphabetic(8), Sets.<Privilege> newHashSet());
    }

    @Override
    public final void invalidate(final Role entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final Role resource) {
        resource.setName(randomAlphabetic(8));
    }

}
