package sl;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19674i {

    /* JADX INFO: renamed from: a */
    public final String f62361a;

    /* JADX INFO: renamed from: b */
    public final int f62362b;

    public C19674i(String content) {
        AbstractC16544l.m18094g(content, "content");
        this.f62361a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i10 = 0; i10 < length; i10++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i10));
        }
        this.f62362b = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        C19674i c19674i = obj instanceof C19674i ? (C19674i) obj : null;
        return (c19674i == null || (str = c19674i.f62361a) == null || !str.equalsIgnoreCase(this.f62361a)) ? false : true;
    }

    public final int hashCode() {
        return this.f62362b;
    }

    public final String toString() {
        return this.f62361a;
    }
}
