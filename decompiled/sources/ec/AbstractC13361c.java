package ec;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: ec.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13361c {

    /* JADX INFO: renamed from: a */
    public final String f42400a;

    /* JADX INFO: renamed from: b */
    public final String f42401b;

    public AbstractC13361c(String str, Rect rect, List list, String str2) {
        this.f42400a = str;
        new Rect(rect);
        Point[] pointArr = new Point[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            pointArr[i10] = new Point((Point) list.get(i10));
        }
        this.f42401b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String mo14946a() {
        return this.f42400a;
    }

    public AbstractC13361c(String str, String str2) {
        this.f42400a = str;
        this.f42401b = str2;
    }
}
