package p1098x5;

import kotlin.jvm.internal.AbstractC16544l;
import p864l5.C16823j;

/* JADX INFO: renamed from: x5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21126e implements InterfaceC21130i {

    /* JADX INFO: renamed from: Y */
    public final C21129h f67125Y;

    public C21126e(C21129h c21129h) {
        this.f67125Y = c21129h;
    }

    @Override // p1098x5.InterfaceC21130i
    /* JADX INFO: renamed from: a */
    public final Object mo10210a(C16823j c16823j) {
        return this.f67125Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21126e) {
            if (AbstractC16544l.m18089b(this.f67125Y, ((C21126e) obj).f67125Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f67125Y.hashCode();
    }
}
