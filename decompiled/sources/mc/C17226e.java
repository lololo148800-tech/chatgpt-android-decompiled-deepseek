package mc;

import lc.EnumC16841a;
import p166Ga.C3029c;
import p310M9.C5311e;
import p808ic.C14960d;

/* JADX INFO: renamed from: mc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17226e {

    /* JADX INFO: renamed from: a */
    public final EnumC16841a f54974a;

    /* JADX INFO: renamed from: b */
    public final int f54975b;

    /* JADX INFO: renamed from: c */
    public final int f54976c;

    /* JADX INFO: renamed from: d */
    public final int f54977d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5311e f54978e;

    public C17226e(C5311e c5311e, EnumC16841a enumC16841a, int i10, int i11, int i12) {
        this.f54978e = c5311e;
        this.f54974a = enumC16841a;
        this.f54975b = i10;
        this.f54976c = i11;
        this.f54977d = i12;
    }

    /* JADX INFO: renamed from: a */
    public final int m18964a() {
        EnumC16841a enumC16841a = EnumC16841a.BYTE;
        EnumC16841a enumC16841a2 = this.f54974a;
        int i10 = this.f54977d;
        if (enumC16841a2 != enumC16841a) {
            return i10;
        }
        C3029c c3029c = (C3029c) this.f54978e.f17486p0;
        C14960d c14960d = (C14960d) c3029c.f9120e;
        String str = (String) c3029c.f9119d;
        int i11 = this.f54975b;
        return str.substring(i11, i10 + i11).getBytes(c14960d.f46597a[this.f54976c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        EnumC16841a enumC16841a = this.f54974a;
        sb2.append(enumC16841a);
        sb2.append('(');
        EnumC16841a enumC16841a2 = EnumC16841a.ECI;
        C5311e c5311e = this.f54978e;
        if (enumC16841a == enumC16841a2) {
            sb2.append(((C14960d) ((C3029c) c5311e.f17486p0).f9120e).f46597a[this.f54976c].charset().displayName());
        } else {
            String str = (String) ((C3029c) c5311e.f17486p0).f9119d;
            int i10 = this.f54975b;
            String strSubstring = str.substring(i10, this.f54977d + i10);
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < strSubstring.length(); i11++) {
                if (strSubstring.charAt(i11) < ' ' || strSubstring.charAt(i11) > '~') {
                    sb3.append('.');
                } else {
                    sb3.append(strSubstring.charAt(i11));
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
