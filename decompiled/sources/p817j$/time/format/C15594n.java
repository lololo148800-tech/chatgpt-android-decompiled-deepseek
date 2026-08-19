package p817j$.time.format;

/* JADX INFO: renamed from: j$.time.format.n */
/* JADX INFO: loaded from: classes4.dex */
final class C15594n extends C15595o {
    @Override // p817j$.time.format.C15595o
    /* JADX INFO: renamed from: e */
    protected final C15595o mo17071e(String str, String str2, C15595o c15595o) {
        return new C15594n(str, str2, c15595o, 0);
    }

    @Override // p817j$.time.format.C15595o
    /* JADX INFO: renamed from: c */
    protected final boolean mo17070c(char c9, char c10) {
        return C15603w.m17081c(c9, c10);
    }

    @Override // p817j$.time.format.C15595o
    /* JADX INFO: renamed from: h */
    protected final boolean mo17072h(CharSequence charSequence, int i10, int i11) {
        int length = this.f48686a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!C15603w.m17081c(this.f48686a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
