package io.digdag.core;

import java.util.List;
import java.util.Map;
import java.util.Date;
import com.google.common.base.*;
import com.google.common.collect.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@ImmutableAbstractStyle
@JsonSerialize(as = ImmutableStoredQueueDesc.class)
@JsonDeserialize(as = ImmutableStoredQueueDesc.class)
public abstract class StoredQueueDesc
        extends QueueDesc
{
    public abstract long getId();

    public abstract int getSiteId();

    public abstract Date getCreatedAt();

    public abstract Date getUpdatedAt();
}