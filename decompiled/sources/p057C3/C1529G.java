package p057C3;

import android.view.View;
import java.util.Arrays;
import p084D4.AbstractC1888L;
import p1073w3.AbstractC20800b;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: C3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1529G {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4107a = 1;

    /* JADX INFO: renamed from: b */
    public int f4108b;

    /* JADX INFO: renamed from: c */
    public int f4109c;

    /* JADX INFO: renamed from: d */
    public boolean f4110d;

    /* JADX INFO: renamed from: e */
    public boolean f4111e;

    /* JADX INFO: renamed from: f */
    public Object f4112f;

    public C1529G(int i10) {
        this.f4108b = i10;
        byte[] bArr = new byte[131];
        this.f4112f = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m2258a(byte[] bArr, int i10, int i11) {
        if (this.f4110d) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f4112f;
            int length = bArr2.length;
            int i13 = this.f4109c;
            if (length < i13 + i12) {
                this.f4112f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f4112f, this.f4109c, i12);
            this.f4109c += i12;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2259b() {
        this.f4109c = this.f4110d ? ((AbstractC1888L) this.f4112f).mo2881g() : ((AbstractC1888L) this.f4112f).mo2885k();
    }

    /* JADX INFO: renamed from: c */
    public void m2260c(View view, int i10) {
        if (this.f4110d) {
            this.f4109c = ((AbstractC1888L) this.f4112f).m2891m() + ((AbstractC1888L) this.f4112f).mo2876b(view);
        } else {
            this.f4109c = ((AbstractC1888L) this.f4112f).mo2879e(view);
        }
        this.f4108b = i10;
    }

    /* JADX INFO: renamed from: d */
    public void m2261d(View view, int i10) {
        int iM2891m = ((AbstractC1888L) this.f4112f).m2891m();
        if (iM2891m >= 0) {
            m2260c(view, i10);
            return;
        }
        this.f4108b = i10;
        if (!this.f4110d) {
            int iMo2879e = ((AbstractC1888L) this.f4112f).mo2879e(view);
            int iMo2885k = iMo2879e - ((AbstractC1888L) this.f4112f).mo2885k();
            this.f4109c = iMo2879e;
            if (iMo2885k > 0) {
                int iMo2881g = (((AbstractC1888L) this.f4112f).mo2881g() - Math.min(0, (((AbstractC1888L) this.f4112f).mo2881g() - iM2891m) - ((AbstractC1888L) this.f4112f).mo2876b(view))) - (((AbstractC1888L) this.f4112f).mo2877c(view) + iMo2879e);
                if (iMo2881g < 0) {
                    this.f4109c -= Math.min(iMo2885k, -iMo2881g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2881g2 = (((AbstractC1888L) this.f4112f).mo2881g() - iM2891m) - ((AbstractC1888L) this.f4112f).mo2876b(view);
        this.f4109c = ((AbstractC1888L) this.f4112f).mo2881g() - iMo2881g2;
        if (iMo2881g2 > 0) {
            int iMo2877c = this.f4109c - ((AbstractC1888L) this.f4112f).mo2877c(view);
            int iMo2885k2 = ((AbstractC1888L) this.f4112f).mo2885k();
            int iMin = iMo2877c - (Math.min(((AbstractC1888L) this.f4112f).mo2879e(view) - iMo2885k2, 0) + iMo2885k2);
            if (iMin < 0) {
                this.f4109c = Math.min(iMo2881g2, -iMin) + this.f4109c;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m2262e(int i10) {
        if (!this.f4110d) {
            return false;
        }
        this.f4109c -= i10;
        this.f4110d = false;
        this.f4111e = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m2263f(int i10) {
        this.f4110d |= i10 > 0;
        this.f4108b += i10;
    }

    /* JADX INFO: renamed from: g */
    public void m2264g() {
        switch (this.f4107a) {
            case 1:
                this.f4108b = -1;
                this.f4109c = Integer.MIN_VALUE;
                this.f4110d = false;
                this.f4111e = false;
                break;
            default:
                this.f4110d = false;
                this.f4111e = false;
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2265h(int i10) {
        AbstractC20800b.m21320h(!this.f4110d);
        boolean z6 = i10 == this.f4108b;
        this.f4110d = z6;
        if (z6) {
            this.f4109c = 3;
            this.f4111e = false;
        }
    }

    public String toString() {
        switch (this.f4107a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f4108b);
                sb2.append(", mCoordinate=");
                sb2.append(this.f4109c);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f4110d);
                sb2.append(", mValid=");
                return AbstractC3794B0.m4499x(sb2, this.f4111e, '}');
            default:
                return super.toString();
        }
    }

    public C1529G(C1547Z c1547z) {
        this.f4112f = c1547z;
    }

    public C1529G() {
        m2264g();
    }
}
