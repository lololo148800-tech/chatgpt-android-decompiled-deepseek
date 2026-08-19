package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11101j {
    /* JADX INFO: renamed from: a */
    public static EnumC11103l m12159a(EnumC11104m state) {
        AbstractC16544l.m18094g(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC11103l.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC11103l.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC11103l.ON_PAUSE;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC11103l m12160b(EnumC11104m state) {
        AbstractC16544l.m18094g(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 1) {
            return EnumC11103l.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC11103l.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC11103l.ON_RESUME;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC11103l m12161c(EnumC11104m state) {
        AbstractC16544l.m18094g(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC11103l.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC11103l.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC11103l.ON_RESUME;
    }
}
