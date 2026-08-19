package p675c6;

import android.graphics.Path;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9058h;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11669d implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final int f35333a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f35334b;

    /* JADX INFO: renamed from: c */
    public final C11249a f35335c;

    /* JADX INFO: renamed from: d */
    public final C11249a f35336d;

    /* JADX INFO: renamed from: e */
    public final C11249a f35337e;

    /* JADX INFO: renamed from: f */
    public final C11249a f35338f;

    /* JADX INFO: renamed from: g */
    public final String f35339g;

    /* JADX INFO: renamed from: h */
    public final boolean f35340h;

    public C11669d(String str, int i10, Path.FillType fillType, C11249a c11249a, C11249a c11249a2, C11249a c11249a3, C11249a c11249a4, boolean z6) {
        this.f35333a = i10;
        this.f35334b = fillType;
        this.f35335c = c11249a;
        this.f35336d = c11249a2;
        this.f35337e = c11249a3;
        this.f35338f = c11249a4;
        this.f35339g = str;
        this.f35340h = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9058h(c7794w, c7781j, abstractC13029b, this);
    }
}
