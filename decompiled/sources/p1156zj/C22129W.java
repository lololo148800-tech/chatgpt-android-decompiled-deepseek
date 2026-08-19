package p1156zj;

import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.helper.widget.Flow;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.ViewTreeObserverOnPreDrawListenerC0787v;
import p049Bm.InterfaceC1426a;
import p099Dj.C2069g;
import p594Y9.AbstractC9722E4;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: zj.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C22129W extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2069g f69953Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f69954Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22133Y f69955o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ StyleElements.Axis f69956p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22129W(C2069g c2069g, long j10, C22133Y c22133y, StyleElements.Axis axis) {
        super(0);
        this.f69953Y = c2069g;
        this.f69954Z = j10;
        this.f69955o0 = c22133y;
        this.f69956p0 = axis;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C2069g c2069g = this.f69953Y;
        int lineCount = c2069g.f6353b.getLineCount();
        Button button = c2069g.f6371t;
        boolean z6 = (lineCount == 0 || button.getLineCount() == 0) ? false : true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f69954Z;
        boolean z10 = jCurrentTimeMillis - j10 > 300;
        StyleElements.Axis axis = this.f69956p0;
        C22133Y c22133y = this.f69955o0;
        if (z6 || z10) {
            Button button2 = c2069g.f6353b;
            if (z6 && (button2.getLineCount() > 1 || button.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
                ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Flow flow = c2069g.f6361j;
                layoutParams.width = flow.getWidth();
                button2.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = flow.getWidth();
                button.setLayoutParams(layoutParams2);
                flow.setReferencedIds(new int[]{button2.getId(), button.getId()});
                c22133y.f69966a.f6362k.setAccessibilityTraversalAfter(R.id.retry_button);
            }
            ViewTreeObserverOnPreDrawListenerC0787v.m1779a(button2, new RunnableC13542a(c22133y, 17));
        } else {
            C2069g c2069g2 = c22133y.f69966a;
            AbstractC9722E4.m10313a(new C22129W(c2069g2, j10, c22133y, axis), c2069g2.f6353b);
        }
        return C17296C.f55119a;
    }
}
