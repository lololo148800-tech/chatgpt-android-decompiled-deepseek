package p540W5;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: W5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8430a extends Paint {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26249a;

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        switch (this.f26249a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    PointF pointF = AbstractC14417f.f45307a;
                    super.setAlpha(Math.max(0, Math.min(255, i10)));
                } else {
                    int color = getColor();
                    PointF pointF2 = AbstractC14417f.f45307a;
                    setColor((Math.max(0, Math.min(255, i10)) << 24) | (color & 16777215));
                }
                break;
            default:
                super.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f26249a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8430a(int i10, int i11) {
        super(i10);
        this.f26249a = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8430a(PorterDuff.Mode mode) {
        super(1);
        this.f26249a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    /* JADX INFO: renamed from: a */
    private final void m9036a(LocaleList localeList) {
    }
}
