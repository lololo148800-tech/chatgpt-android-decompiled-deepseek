package p468T2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p451Sb.C7102a;

/* JADX INFO: renamed from: T2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C7208A implements Spannable {

    /* JADX INFO: renamed from: Y */
    public boolean f22881Y = false;

    /* JADX INFO: renamed from: Z */
    public Spannable f22882Z;

    public C7208A(Spannable spannable) {
        this.f22882Z = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m7600a() {
        Spannable spannable = this.f22882Z;
        if (!this.f22881Y) {
            if ((Build.VERSION.SDK_INT < 28 ? new C7102a(17) : new C7234z(17)).mo7516x(spannable)) {
                this.f22882Z = new SpannableString(spannable);
            }
        }
        this.f22881Y = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f22882Z.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.IntStream.VivifiedWrapper.convert(this.f22882Z.chars()));
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return j$.util.stream.IntStream.Wrapper.convert(j$.util.stream.IntStream.VivifiedWrapper.convert(this.f22882Z.codePoints()));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f22882Z.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f22882Z.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f22882Z.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f22882Z.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f22882Z.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f22882Z.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m7600a();
        this.f22882Z.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        m7600a();
        this.f22882Z.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f22882Z.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f22882Z.toString();
    }

    @Override // java.lang.CharSequence
    public final p817j$.util.stream.IntStream chars() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f22882Z.chars());
    }

    @Override // java.lang.CharSequence
    public final p817j$.util.stream.IntStream codePoints() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.f22882Z.codePoints());
    }
}
