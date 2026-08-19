package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFlags {
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* JADX INFO: renamed from: a */
    public static final Flags.BooleanFlagField f52658a = Flags.FlagField.booleanFirst();

    static {
        Flags.FlagField.booleanAfter(Flags.FlagField.booleanFirst());
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return f52658a;
    }
}
