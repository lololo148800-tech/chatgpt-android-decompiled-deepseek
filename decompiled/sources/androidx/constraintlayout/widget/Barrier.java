package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import p760g2.C13804a;
import p760g2.C13807d;
import p822j2.AbstractC16045b;
import p822j2.AbstractC16059p;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends AbstractC16045b {

    /* JADX INFO: renamed from: v0 */
    public int f32837v0;

    /* JADX INFO: renamed from: w0 */
    public int f32838w0;

    /* JADX INFO: renamed from: x0 */
    public C13804a f32839x0;

    public Barrier(Context context) {
        super(context);
        this.f49495o0 = new int[32];
        this.f49501u0 = new HashMap();
        this.f49497q0 = context;
        mo11358g(null);
        super.setVisibility(8);
    }

    @Override // p822j2.AbstractC16045b
    /* JADX INFO: renamed from: g */
    public final void mo11358g(AttributeSet attributeSet) {
        super.mo11358g(attributeSet);
        this.f32839x0 = new C13804a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f32839x0.f43600u0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f32839x0.f43601v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f49498r0 = this.f32839x0;
        m17616i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f32839x0.f43600u0;
    }

    public int getMargin() {
        return this.f32839x0.f43601v0;
    }

    public int getType() {
        return this.f32837v0;
    }

    @Override // p822j2.AbstractC16045b
    /* JADX INFO: renamed from: h */
    public final void mo11359h(C13807d c13807d, boolean z6) {
        int i10 = this.f32837v0;
        this.f32838w0 = i10;
        if (z6) {
            if (i10 == 5) {
                this.f32838w0 = 1;
            } else if (i10 == 6) {
                this.f32838w0 = 0;
            }
        } else if (i10 == 5) {
            this.f32838w0 = 0;
        } else if (i10 == 6) {
            this.f32838w0 = 1;
        }
        if (c13807d instanceof C13804a) {
            ((C13804a) c13807d).f43599t0 = this.f32838w0;
        }
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f32839x0.f43600u0 = z6;
    }

    public void setDpMargin(int i10) {
        this.f32839x0.f43601v0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f32839x0.f43601v0 = i10;
    }

    public void setType(int i10) {
        this.f32837v0 = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
