package p732en;

import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: renamed from: en.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C13444a {

    /* JADX INFO: renamed from: a */
    public final MessageLite f42568a;

    /* JADX INFO: renamed from: b */
    public final int f42569b;

    public C13444a(MessageLite messageLite, int i10) {
        this.f42568a = messageLite;
        this.f42569b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13444a)) {
            return false;
        }
        C13444a c13444a = (C13444a) obj;
        return this.f42568a == c13444a.f42568a && this.f42569b == c13444a.f42569b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f42568a) * 65535) + this.f42569b;
    }
}
