package p1049up;

import bj.AbstractC11471r;
import bj.C11473t;
import bj.C11478y;
import bj.EnumC11476w;
import mo.AbstractC17329F;
import p026Ao.C0678l;
import p026Ao.InterfaceC0677k;
import p1027tp.InterfaceC20067k;
import p959q8.C18639a;

/* JADX INFO: renamed from: up.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C20410c implements InterfaceC20067k {

    /* JADX INFO: renamed from: Z */
    public static final C0678l f64530Z;

    /* JADX INFO: renamed from: Y */
    public final AbstractC11471r f64531Y;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f64530Z = C18639a.m19995k("EFBBBF");
    }

    public C20410c(AbstractC11471r abstractC11471r) {
        this.f64531Y = abstractC11471r;
    }

    @Override // p1027tp.InterfaceC20067k
    /* JADX INFO: renamed from: a */
    public final Object mo15962a(Object obj) {
        AbstractC17329F abstractC17329F = (AbstractC17329F) obj;
        InterfaceC0677k interfaceC0677kMo18988O0 = abstractC17329F.mo18988O0();
        try {
            C0678l c0678l = f64530Z;
            if (interfaceC0677kMo18988O0.mo1361p0(0L, c0678l)) {
                interfaceC0677kMo18988O0.skip(c0678l.f1972Y.length);
            }
            C11478y c11478y = new C11478y(interfaceC0677kMo18988O0);
            Object objFromJson = this.f64531Y.fromJson(c11478y);
            if (c11478y.mo12805S() != EnumC11476w.f34695v0) {
                throw new C11473t("JSON document was not fully consumed.");
            }
            abstractC17329F.close();
            return objFromJson;
        } catch (Throwable th2) {
            abstractC17329F.close();
            throw th2;
        }
    }
}
