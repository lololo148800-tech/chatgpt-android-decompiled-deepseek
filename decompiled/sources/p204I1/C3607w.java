package p204I1;

import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: I1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3607w {

    /* JADX INFO: renamed from: b */
    public static final C3607w f10992b = new C3607w(false);

    /* JADX INFO: renamed from: a */
    public final boolean f10993a;

    public C3607w() {
        this.f10993a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3607w) {
            return this.f10993a == ((C3607w) obj).f10993a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10993a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return AbstractC14376f.m15823B(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f10993a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public C3607w(boolean z6) {
        this.f10993a = z6;
    }
}
