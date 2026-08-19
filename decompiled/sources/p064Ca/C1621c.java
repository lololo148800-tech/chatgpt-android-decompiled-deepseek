package p064Ca;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p523V9.AbstractC7987S3;

/* JADX INFO: renamed from: Ca.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1621c extends AbstractC7987S3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f4588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextPaint f4589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC7987S3 f4590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1622d f4591d;

    public C1621c(C1622d c1622d, Context context, TextPaint textPaint, AbstractC7987S3 abstractC7987S3) {
        this.f4591d = c1622d;
        this.f4588a = context;
        this.f4589b = textPaint;
        this.f4590c = abstractC7987S3;
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: e */
    public final void mo2475e(int i10) {
        this.f4590c.mo2475e(i10);
    }

    @Override // p523V9.AbstractC7987S3
    /* JADX INFO: renamed from: f */
    public final void mo2476f(Typeface typeface, boolean z6) {
        this.f4591d.m2485g(this.f4588a, this.f4589b, typeface);
        this.f4590c.mo2476f(typeface, z6);
    }
}
