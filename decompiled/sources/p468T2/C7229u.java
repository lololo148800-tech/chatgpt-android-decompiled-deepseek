package p468T2;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: T2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7229u extends SpannableStringBuilder {

    /* JADX INFO: renamed from: Y */
    public final Class f22930Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f22931Z;

    public C7229u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f22931Z = new ArrayList();
        AbstractC4941g.m5558Q(cls, "watcherClass cannot be null");
        this.f22930Y = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m7626a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22931Z;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((C7228t) arrayList.get(i10)).f22929Z.incrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m7627b() {
        m7630e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22931Z;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((C7228t) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C7228t m7628c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22931Z;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C7228t c7228t = (C7228t) arrayList.get(i10);
            if (c7228t.f22928Y == obj) {
                return c7228t;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7629d(Object obj) {
        if (obj != null) {
            if (this.f22930Y == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m7630e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22931Z;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((C7228t) arrayList.get(i10)).f22929Z.decrementAndGet();
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C7228t c7228tM7628c;
        if (m7629d(obj) && (c7228tM7628c = m7628c(obj)) != null) {
            obj = c7228tM7628c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C7228t c7228tM7628c;
        if (m7629d(obj) && (c7228tM7628c = m7628c(obj)) != null) {
            obj = c7228tM7628c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C7228t c7228tM7628c;
        if (m7629d(obj) && (c7228tM7628c = m7628c(obj)) != null) {
            obj = c7228tM7628c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.f22930Y != cls) {
            return super.getSpans(i10, i11, cls);
        }
        C7228t[] c7228tArr = (C7228t[]) super.getSpans(i10, i11, C7228t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c7228tArr.length);
        for (int i12 = 0; i12 < c7228tArr.length; i12++) {
            objArr[i12] = c7228tArr[i12].f22928Y;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f22930Y == cls) {
            cls = C7228t.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C7228t c7228tM7628c;
        if (m7629d(obj)) {
            c7228tM7628c = m7628c(obj);
            if (c7228tM7628c != null) {
                obj = c7228tM7628c;
            }
        } else {
            c7228tM7628c = null;
        }
        super.removeSpan(obj);
        if (c7228tM7628c != null) {
            this.f22931Z.remove(c7228tM7628c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (m7629d(obj)) {
            C7228t c7228t = new C7228t(obj);
            this.f22931Z.add(c7228t);
            obj = c7228t;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new C7229u(this.f22930Y, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        m7626a();
        super.replace(i10, i11, charSequence);
        m7630e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public C7229u(Class cls, C7229u c7229u, int i10, int i11) {
        super(c7229u, i10, i11);
        this.f22931Z = new ArrayList();
        AbstractC4941g.m5558Q(cls, "watcherClass cannot be null");
        this.f22930Y = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        m7626a();
        super.replace(i10, i11, charSequence, i12, i13);
        m7630e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
