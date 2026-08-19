package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p880m.AbstractC17123a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: o0 */
    public final int f32075o0;

    /* JADX INFO: renamed from: p0 */
    public final int f32076p0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54751t);
        this.f32076p0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f32075o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
