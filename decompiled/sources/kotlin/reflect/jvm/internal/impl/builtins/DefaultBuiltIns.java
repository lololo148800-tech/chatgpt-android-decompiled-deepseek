package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mm.C17314q;
import p345Nm.C5855a;
import p571X9.AbstractC9227W;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final C17314q f51294f = AbstractC9227W.m9800c(C5855a.f19154o0);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.f51294f.getValue();
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z6) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z6) {
            m18109c(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z6);
    }
}
