package p629Zl;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Zl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10424e implements Appendable, CharSequence {

    /* JADX INFO: renamed from: Z */
    public final ArrayDeque f30891Z = new ArrayDeque(8);

    /* JADX INFO: renamed from: Y */
    public final StringBuilder f30890Y = new StringBuilder((CharSequence) "");

    public C10424e() {
        m10912b(0, "");
    }

    /* JADX INFO: renamed from: c */
    public static void m10910c(C10424e c10424e, Object obj, int i10, int i11) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c10424e.f30891Z.push(new C10422c(obj, i10, i11, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m10910c(c10424e, obj2, i10, i11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10911a(char c9) {
        this.f30890Y.append(c9);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        this.f30890Y.append(c9);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m10912b(int i10, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z6 = spanned instanceof C10423d;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f30891Z;
                if (!z6) {
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj = spans[i11];
                        arrayDeque.push(new C10422c(obj, spanned.getSpanStart(obj) + i10, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i12 = length - 1; i12 >= 0; i12--) {
                    Object obj2 = spans[i12];
                    arrayDeque.push(new C10422c(obj2, spanned.getSpanStart(obj2) + i10, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f30890Y.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f30890Y.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        List<C10422c> listUnmodifiableList;
        int i12;
        StringBuilder sb2 = this.f30890Y;
        int length = sb2.length();
        if (i11 > i10 && i10 >= 0 && i11 <= length) {
            ArrayDeque arrayDeque = this.f30891Z;
            if (i10 == 0 && length == i11) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C10422c c10422c = (C10422c) itDescendingIterator.next();
                    int i13 = c10422c.f30887b;
                    if ((i13 >= i10 && i13 < i11) || (((i12 = c10422c.f30888c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                        arrayList2.add(c10422c);
                    }
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
        } else {
            listUnmodifiableList = Collections.emptyList();
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb2.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i10, i11));
        int length2 = spannableStringBuilder.length();
        for (C10422c c10422c2 : listUnmodifiableList) {
            int iMax = Math.max(0, c10422c2.f30887b - i10);
            spannableStringBuilder.setSpan(c10422c2.f30886a, iMax, Math.min(length2, (c10422c2.f30888c - c10422c2.f30887b) + iMax), c10422c2.f30889d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f30890Y.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
        StringBuilder sb2 = this.f30890Y;
        m10912b(sb2.length(), charSequenceSubSequence);
        sb2.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb2 = this.f30890Y;
        m10912b(sb2.length(), charSequence);
        sb2.append(charSequence);
        return this;
    }
}
