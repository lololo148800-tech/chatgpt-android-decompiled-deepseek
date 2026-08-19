package p577Xf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Xf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9509h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f28630a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9509h) && AbstractC16544l.m18089b(this.f28630a, ((C9509h) obj).f28630a);
    }

    public final int hashCode() {
        String str = this.f28630a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
