package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16049f {

    /* JADX INFO: renamed from: a */
    public final float f49579a;

    /* JADX INFO: renamed from: b */
    public final float f49580b;

    /* JADX INFO: renamed from: c */
    public final float f49581c;

    /* JADX INFO: renamed from: d */
    public final float f49582d;

    /* JADX INFO: renamed from: e */
    public final int f49583e;

    public C16049f(Context context, XmlResourceParser xmlResourceParser) {
        this.f49579a = Float.NaN;
        this.f49580b = Float.NaN;
        this.f49581c = Float.NaN;
        this.f49582d = Float.NaN;
        this.f49583e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC16059p.f49713j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f49583e);
                this.f49583e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C16056m().m17636c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f49582d = typedArrayObtainStyledAttributes.getDimension(index, this.f49582d);
            } else if (index == 2) {
                this.f49580b = typedArrayObtainStyledAttributes.getDimension(index, this.f49580b);
            } else if (index == 3) {
                this.f49581c = typedArrayObtainStyledAttributes.getDimension(index, this.f49581c);
            } else if (index == 4) {
                this.f49579a = typedArrayObtainStyledAttributes.getDimension(index, this.f49579a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
