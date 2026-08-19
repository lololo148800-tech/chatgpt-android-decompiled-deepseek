package p064Ca;

import android.graphics.Typeface;
import p025An.C0624m;
import p328N1.C5576C;
import p523V9.AbstractC7987S3;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: Ca.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1620b extends AbstractC18610b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4585h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4586i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f4587j;

    public C1620b(C0624m c0624m, C5576C c5576c) {
        this.f4586i = c0624m;
        this.f4587j = c5576c;
    }

    @Override // p955q2.AbstractC18610b
    /* JADX INFO: renamed from: i */
    public final void mo2477i(int i10) {
        switch (this.f4585h) {
            case 0:
                ((C1622d) this.f4587j).f4604m = true;
                ((AbstractC7987S3) this.f4586i).mo2475e(i10);
                break;
            default:
                ((C0624m) this.f4586i).mo1244b(new IllegalStateException("Unable to load font " + ((C5576C) this.f4587j) + " (reason=" + i10 + ')'));
                break;
        }
    }

    @Override // p955q2.AbstractC18610b
    /* JADX INFO: renamed from: j */
    public final void mo2478j(Typeface typeface) {
        switch (this.f4585h) {
            case 0:
                C1622d c1622d = (C1622d) this.f4587j;
                c1622d.f4605n = Typeface.create(typeface, c1622d.f4594c);
                c1622d.f4604m = true;
                ((AbstractC7987S3) this.f4586i).mo2476f(c1622d.f4605n, false);
                break;
            default:
                ((C0624m) this.f4586i).resumeWith(typeface);
                break;
        }
    }

    public C1620b(C1622d c1622d, AbstractC7987S3 abstractC7987S3) {
        this.f4587j = c1622d;
        this.f4586i = abstractC7987S3;
    }
}
