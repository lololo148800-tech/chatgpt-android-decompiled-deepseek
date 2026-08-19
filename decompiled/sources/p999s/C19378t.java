package p999s;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p517V2.C7745f;
import p594Y9.AbstractC9877e0;
import p720e6.C13288c;
import p880m.AbstractC17123a;

/* JADX INFO: renamed from: s.t */
/* JADX INFO: loaded from: classes.dex */
public final class C19378t {

    /* JADX INFO: renamed from: a */
    public final TextView f61373a;

    /* JADX INFO: renamed from: b */
    public final C13288c f61374b;

    public C19378t(TextView textView) {
        this.f61373a = textView;
        C13288c c13288c = new C13288c();
        c13288c.f42001Y = new C7745f(textView);
        this.f61374b = c13288c;
    }

    /* JADX INFO: renamed from: a */
    public final void m20479a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f61373a.getContext().obtainStyledAttributes(attributeSet, AbstractC17123a.f54740i, i10, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m20481c(z6);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20480b(boolean z6) {
        ((AbstractC9877e0) this.f61374b.f42001Y).mo8005c(z6);
    }

    /* JADX INFO: renamed from: c */
    public final void m20481c(boolean z6) {
        ((AbstractC9877e0) this.f61374b.f42001Y).mo8006d(z6);
    }
}
