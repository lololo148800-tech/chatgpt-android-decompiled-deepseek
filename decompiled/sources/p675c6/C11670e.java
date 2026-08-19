package p675c6;

import java.util.ArrayList;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9059i;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p660b6.C11250b;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11670e implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35341a;

    /* JADX INFO: renamed from: b */
    public final int f35342b;

    /* JADX INFO: renamed from: c */
    public final C11249a f35343c;

    /* JADX INFO: renamed from: d */
    public final C11249a f35344d;

    /* JADX INFO: renamed from: e */
    public final C11249a f35345e;

    /* JADX INFO: renamed from: f */
    public final C11249a f35346f;

    /* JADX INFO: renamed from: g */
    public final C11250b f35347g;

    /* JADX INFO: renamed from: h */
    public final int f35348h;

    /* JADX INFO: renamed from: i */
    public final int f35349i;

    /* JADX INFO: renamed from: j */
    public final float f35350j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f35351k;

    /* JADX INFO: renamed from: l */
    public final C11250b f35352l;

    /* JADX INFO: renamed from: m */
    public final boolean f35353m;

    public C11670e(String str, int i10, C11249a c11249a, C11249a c11249a2, C11249a c11249a3, C11249a c11249a4, C11250b c11250b, int i11, int i12, float f10, ArrayList arrayList, C11250b c11250b2, boolean z6) {
        this.f35341a = str;
        this.f35342b = i10;
        this.f35343c = c11249a;
        this.f35344d = c11249a2;
        this.f35345e = c11249a3;
        this.f35346f = c11249a4;
        this.f35347g = c11250b;
        this.f35348h = i11;
        this.f35349i = i12;
        this.f35350j = f10;
        this.f35351k = arrayList;
        this.f35352l = c11250b2;
        this.f35353m = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9059i(c7794w, abstractC13029b, this);
    }
}
