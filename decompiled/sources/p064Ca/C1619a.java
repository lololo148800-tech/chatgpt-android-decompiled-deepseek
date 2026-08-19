package p064Ca;

import android.graphics.Typeface;
import p523V9.AbstractC7987S3;
import p594Y9.C9895g4;
import za.C21819b;

/* JADX INFO: renamed from: Ca.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1619a extends AbstractC7987S3 {

    /* JADX INFO: renamed from: a */
    public final Typeface f4582a;

    /* JADX INFO: renamed from: b */
    public final C9895g4 f4583b;

    /* JADX INFO: renamed from: c */
    public boolean f4584c;

    public C1619a(C9895g4 c9895g4, Typeface typeface) {
        this.f4582a = typeface;
        this.f4583b = c9895g4;
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: e */
    public final void mo2475e(int i10) {
        if (this.f4584c) {
            return;
        }
        C21819b c21819b = (C21819b) this.f4583b.f29409Y;
        if (c21819b.m22300j(this.f4582a)) {
            c21819b.m22298h(false);
        }
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: f */
    public final void mo2476f(Typeface typeface, boolean z6) {
        if (this.f4584c) {
            return;
        }
        C21819b c21819b = (C21819b) this.f4583b.f29409Y;
        if (c21819b.m22300j(typeface)) {
            c21819b.m22298h(false);
        }
    }
}
