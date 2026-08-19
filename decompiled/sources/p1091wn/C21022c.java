package p1091wn;

import io.ktor.client.plugins.auth.C15058c;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1112xm.EnumC21303g;
import p491U0.C7535c;

/* JADX INFO: renamed from: wn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C21022c implements InterfaceC21029j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66890a;

    /* JADX INFO: renamed from: b */
    public final Object f66891b;

    /* JADX INFO: renamed from: c */
    public final Object f66892c;

    public /* synthetic */ C21022c(InterfaceC21029j interfaceC21029j, InterfaceC17302e interfaceC17302e, int i10) {
        this.f66890a = i10;
        this.f66891b = interfaceC21029j;
        this.f66892c = interfaceC17302e;
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        switch (this.f66890a) {
            case 0:
                return new C21021b(new C21025f((C21028i) this.f66891b), (C15058c) this.f66892c);
            case 1:
                return new C7535c(this, (byte) 0);
            case 2:
                return new C21025f(this);
            case 3:
                return new C7535c(this);
            default:
                return new C21021b(this);
        }
    }

    public C21022c(File start) {
        this.f66890a = 4;
        EnumC21303g enumC21303g = EnumC21303g.f67713Y;
        AbstractC16544l.m18094g(start, "start");
        this.f66891b = start;
        this.f66892c = enumC21303g;
    }

    public C21022c(InterfaceC21029j sequence, InterfaceC1436k interfaceC1436k) {
        this.f66890a = 2;
        AbstractC16544l.m18094g(sequence, "sequence");
        this.f66891b = sequence;
        this.f66892c = interfaceC1436k;
    }

    public C21022c(InterfaceC1426a interfaceC1426a, InterfaceC1436k getNextValue) {
        this.f66890a = 1;
        AbstractC16544l.m18094g(getNextValue, "getNextValue");
        this.f66891b = interfaceC1426a;
        this.f66892c = getNextValue;
    }
}
