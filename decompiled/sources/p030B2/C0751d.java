package p030B2;

import android.content.ClipData;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import p283L5.AbstractC4941g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: B2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0751d implements InterfaceC0749c, InterfaceC0753e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2124Y = 0;

    /* JADX INFO: renamed from: Z */
    public ClipData f2125Z;

    /* JADX INFO: renamed from: o0 */
    public int f2126o0;

    /* JADX INFO: renamed from: p0 */
    public int f2127p0;

    /* JADX INFO: renamed from: q0 */
    public Uri f2128q0;

    /* JADX INFO: renamed from: r0 */
    public Bundle f2129r0;

    public /* synthetic */ C0751d() {
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: a */
    public ClipData mo1604a() {
        return this.f2125Z;
    }

    @Override // p030B2.InterfaceC0749c
    public C0755f build() {
        return new C0755f(new C0751d(this));
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: c */
    public int mo1605c() {
        return this.f2127p0;
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: d */
    public void mo1596d(Bundle bundle) {
        this.f2129r0 = bundle;
    }

    @Override // p030B2.InterfaceC0753e
    /* JADX INFO: renamed from: e */
    public ContentInfo mo1606e() {
        return null;
    }

    @Override // p030B2.InterfaceC0753e
    public int getSource() {
        return this.f2126o0;
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: h */
    public void mo1597h(Uri uri) {
        this.f2128q0 = uri;
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: k */
    public void mo1598k(int i10) {
        this.f2127p0 = i10;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f2124Y) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f2125Z.getDescription());
                sb2.append(", source=");
                int i10 = this.f2126o0;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i11 = this.f2127p0;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                Uri uri = this.f2128q0;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + Separators.RPAREN;
                }
                sb2.append(str);
                return AbstractC9306j0.m9891j(this.f2129r0 != null ? ", hasExtras" : "", "}", sb2);
            default:
                return super.toString();
        }
    }

    public C0751d(C0751d c0751d) {
        ClipData clipData = c0751d.f2125Z;
        clipData.getClass();
        this.f2125Z = clipData;
        int i10 = c0751d.f2126o0;
        AbstractC4941g.m5556O("source", i10, 0, 5);
        this.f2126o0 = i10;
        int i11 = c0751d.f2127p0;
        if ((i11 & 1) == i11) {
            this.f2127p0 = i11;
            this.f2128q0 = c0751d.f2128q0;
            this.f2129r0 = c0751d.f2129r0;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
