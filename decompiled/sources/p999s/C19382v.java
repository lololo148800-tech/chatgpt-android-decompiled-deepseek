package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import mo.C17342i;
import p013Ab.C0420b;
import p084D4.C1904b;

/* JADX INFO: renamed from: s.v */
/* JADX INFO: loaded from: classes.dex */
public class C19382v extends ImageView {

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61394o0;

    /* JADX INFO: renamed from: p0 */
    public final C0420b f61395p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f61396q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19382v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC19313P0.m20399a(context);
        this.f61396q0 = false;
        AbstractC19311O0.m20394a(this, getContext());
        C1904b c1904b = new C1904b(this);
        this.f61394o0 = c1904b;
        c1904b.m3003k(attributeSet, i10);
        C0420b c0420b = new C0420b(this);
        this.f61395p0 = c0420b;
        c0420b.m1069y(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            c0420b.m1048c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C17342i c17342i;
        C0420b c0420b = this.f61395p0;
        if (c0420b == null || (c17342i = (C17342i) c0420b.f1383p0) == null) {
            return null;
        }
        return (ColorStateList) c17342i.f55254c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C17342i c17342i;
        C0420b c0420b = this.f61395p0;
        if (c0420b == null || (c17342i = (C17342i) c0420b.f1383p0) == null) {
            return null;
        }
        return (PorterDuff.Mode) c17342i.f55255d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f61395p0.f1382o0).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            c0420b.m1048c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0420b c0420b = this.f61395p0;
        if (c0420b != null && drawable != null && !this.f61396q0) {
            c0420b.f1381Z = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0420b != null) {
            c0420b.m1048c();
            if (this.f61396q0) {
                return;
            }
            ImageView imageView = (ImageView) c0420b.f1382o0;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0420b.f1381Z);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f61396q0 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            c0420b.m1040C(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            c0420b.m1048c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61394o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            if (((C17342i) c0420b.f1383p0) == null) {
                c0420b.f1383p0 = new C17342i();
            }
            C17342i c17342i = (C17342i) c0420b.f1383p0;
            c17342i.f55254c = colorStateList;
            c17342i.f55253b = true;
            c0420b.m1048c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0420b c0420b = this.f61395p0;
        if (c0420b != null) {
            if (((C17342i) c0420b.f1383p0) == null) {
                c0420b.f1383p0 = new C17342i();
            }
            C17342i c17342i = (C17342i) c0420b.f1383p0;
            c17342i.f55255d = mode;
            c17342i.f55252a = true;
            c0420b.m1048c();
        }
    }
}
