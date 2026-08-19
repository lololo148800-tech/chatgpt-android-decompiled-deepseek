package p374P5;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0627n0;
import p033B5.C0838v;

/* JADX INFO: renamed from: P5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6348a implements InterfaceC6362o {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0627n0 f20613Y;

    public /* synthetic */ C6348a(InterfaceC0627n0 interfaceC0627n0) {
        this.f20613Y = interfaceC0627n0;
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo6969e() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6348a) {
            return AbstractC16544l.m18089b(this.f20613Y, ((C6348a) obj).f20613Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20613Y.hashCode();
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo6970m() {
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object mo6971n(C0838v c0838v) {
        return C17296C.f55119a;
    }

    @Override // p374P5.InterfaceC6362o
    public final /* synthetic */ void start() {
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f20613Y + ')';
    }
}
