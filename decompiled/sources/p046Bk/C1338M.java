package p046Bk;

import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p002A0.C0130g;
import p006A4.C0349j;
import p074Ck.C1717b;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Bk.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C1338M {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f3533a;

    /* JADX INFO: renamed from: b */
    public final C17314q f3534b;

    /* JADX INFO: renamed from: c */
    public boolean f3535c;

    /* JADX INFO: renamed from: d */
    public C0349j f3536d;

    public C1338M(ViewGroup contentView) {
        AbstractC16544l.m18094g(contentView, "contentView");
        this.f3533a = contentView;
        this.f3534b = AbstractC9227W.m9800c(new C0130g(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final C1717b m2029a() {
        return (C1717b) this.f3534b.getValue();
    }
}
