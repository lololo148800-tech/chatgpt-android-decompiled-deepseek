package p675c6;

import java.util.ArrayList;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9069s;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p660b6.C11250b;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11680o implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35394a;

    /* JADX INFO: renamed from: b */
    public final C11250b f35395b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35396c;

    /* JADX INFO: renamed from: d */
    public final C11249a f35397d;

    /* JADX INFO: renamed from: e */
    public final C11249a f35398e;

    /* JADX INFO: renamed from: f */
    public final C11250b f35399f;

    /* JADX INFO: renamed from: g */
    public final int f35400g;

    /* JADX INFO: renamed from: h */
    public final int f35401h;

    /* JADX INFO: renamed from: i */
    public final float f35402i;

    /* JADX INFO: renamed from: j */
    public final boolean f35403j;

    public C11680o(String str, C11250b c11250b, ArrayList arrayList, C11249a c11249a, C11249a c11249a2, C11250b c11250b2, int i10, int i11, float f10, boolean z6) {
        this.f35394a = str;
        this.f35395b = c11250b;
        this.f35396c = arrayList;
        this.f35397d = c11249a;
        this.f35398e = c11249a2;
        this.f35399f = c11250b2;
        this.f35400g = i10;
        this.f35401h = i11;
        this.f35402i = f10;
        this.f35403j = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9069s(c7794w, abstractC13029b, this);
    }
}
