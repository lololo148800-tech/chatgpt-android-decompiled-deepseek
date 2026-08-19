package p517V2;

import android.text.InputFilter;
import android.widget.TextView;
import p468T2.C7218j;
import p594Y9.AbstractC9877e0;

/* JADX INFO: renamed from: V2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7745f extends AbstractC9877e0 {

    /* JADX INFO: renamed from: a */
    public final C7744e f24420a;

    public C7745f(TextView textView) {
        this.f24420a = new C7744e(textView);
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: b */
    public final InputFilter[] mo8004b(InputFilter[] inputFilterArr) {
        return !C7218j.m7610c() ? inputFilterArr : this.f24420a.mo8004b(inputFilterArr);
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: c */
    public final void mo8005c(boolean z6) {
        if (C7218j.m7610c()) {
            this.f24420a.mo8005c(z6);
        }
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: d */
    public final void mo8006d(boolean z6) {
        boolean zM7610c = C7218j.m7610c();
        C7744e c7744e = this.f24420a;
        if (zM7610c) {
            c7744e.mo8006d(z6);
        } else {
            c7744e.f24419c = z6;
        }
    }
}
