package org.xcorpion.jdiff.handler;

import org.xcorpion.jdiff.api.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Date;

public class DateTypeHandler implements TypeHandler<Date> {

    @Nullable
    @Override
    public Date merge(@Nullable Date parent, @Nonnull MergingContext mergingContext) {
        return null;
    }

    @Nonnull
    @Override
    public DiffNode diff(@Nullable Date src, @Nullable Date target, @Nonnull DiffContext diffContext) {
        return null;
    }

}
