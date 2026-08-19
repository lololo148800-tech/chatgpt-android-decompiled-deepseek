package pa;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p084D4.AbstractC1898W;
import p817j$.util.DesugarCollections;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18314a extends AbstractC1898W {

    /* JADX INFO: renamed from: a */
    public final Paint f58453a;

    /* JADX INFO: renamed from: b */
    public final List f58454b;

    public C18314a() {
        Paint paint = new Paint();
        this.f58453a = paint;
        this.f58454b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p084D4.AbstractC1898W
    /* JADX INFO: renamed from: c */
    public final void mo2854c(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f58453a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f58454b.iterator();
        while (it.hasNext()) {
            ((AbstractC18315b) it.next()).getClass();
            paint.setColor(AbstractC18861b.m20164b(0.0f, -65281, -16776961));
            float fM2927E = ((CarouselLayoutManager) recyclerView.getLayoutManager()).m2927E();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(0.0f, fM2927E, 0.0f, carouselLayoutManager.f5556o - carouselLayoutManager.m2924B(), paint);
        }
    }
}
