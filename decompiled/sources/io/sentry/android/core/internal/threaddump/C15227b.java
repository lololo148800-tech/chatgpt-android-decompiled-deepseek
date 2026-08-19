package io.sentry.android.core.internal.threaddump;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p822j2.AbstractC16059p;
import p822j2.C16056m;

/* JADX INFO: renamed from: io.sentry.android.core.internal.threaddump.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15227b {

    /* JADX INFO: renamed from: a */
    public final int f47505a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f47506b;

    /* JADX INFO: renamed from: c */
    public int f47507c;

    public C15227b(ArrayList arrayList) {
        this.f47506b = arrayList;
        this.f47505a = arrayList.size();
    }

    /* JADX INFO: renamed from: a */
    public C15226a m16433a() {
        int i10 = this.f47507c;
        if (i10 < 0 || i10 >= this.f47505a) {
            return null;
        }
        this.f47507c = i10 + 1;
        return (C15226a) this.f47506b.get(i10);
    }

    public C15227b(Context context, XmlResourceParser xmlResourceParser) {
        this.f47506b = new ArrayList();
        this.f47507c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC16059p.f49711h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f47505a = typedArrayObtainStyledAttributes.getResourceId(index, this.f47505a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f47507c);
                this.f47507c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C16056m().m17636c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
