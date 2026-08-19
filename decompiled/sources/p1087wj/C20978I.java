package p1087wj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1131yj.InterfaceC21546a;
import p729ej.InterfaceC13427r;
import p770gk.InterfaceC14185a;

/* JADX INFO: renamed from: wj.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C20978I implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f66793b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20971B f66794c;

    /* JADX INFO: renamed from: d */
    public final String f66795d;

    /* JADX INFO: renamed from: e */
    public final String f66796e;

    /* JADX INFO: renamed from: f */
    public final String f66797f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC21546a f66798g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC14185a f66799h;

    /* JADX INFO: renamed from: i */
    public final List f66800i;

    public C20978I(String str, InterfaceC20971B interfaceC20971B, String str2, String str3, String str4, InterfaceC21546a interfaceC21546a, InterfaceC14185a interfaceC14185a, List list) {
        this.f66793b = str;
        this.f66794c = interfaceC20971B;
        this.f66795d = str2;
        this.f66796e = str3;
        this.f66797f = str4;
        this.f66798g = interfaceC21546a;
        this.f66799h = interfaceC14185a;
        this.f66800i = list;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C20978I) {
            if (AbstractC16544l.m18089b(this.f66793b, ((C20978I) otherWorker).f66793b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C20977H(this, null));
    }
}
