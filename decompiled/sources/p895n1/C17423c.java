package p895n1;

import java.util.ArrayList;
import java.util.List;
import p909nm.C17689w;

/* JADX INFO: renamed from: n1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17423c {

    /* JADX INFO: renamed from: a */
    public final String f55671a;

    /* JADX INFO: renamed from: b */
    public final float f55672b;

    /* JADX INFO: renamed from: c */
    public final float f55673c;

    /* JADX INFO: renamed from: d */
    public final float f55674d;

    /* JADX INFO: renamed from: e */
    public final float f55675e;

    /* JADX INFO: renamed from: f */
    public final float f55676f;

    /* JADX INFO: renamed from: g */
    public final float f55677g;

    /* JADX INFO: renamed from: h */
    public final float f55678h;

    /* JADX INFO: renamed from: i */
    public final List f55679i;

    /* JADX INFO: renamed from: j */
    public final List f55680j;

    public C17423c(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = AbstractC17418F.f55636a;
            list = C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList();
        this.f55671a = str;
        this.f55672b = f10;
        this.f55673c = f11;
        this.f55674d = f12;
        this.f55675e = f13;
        this.f55676f = f14;
        this.f55677g = f15;
        this.f55678h = f16;
        this.f55679i = list;
        this.f55680j = arrayList;
    }
}
