package p544W9;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.AbstractC16544l;
import p233J4.C4256b;
import p477Tb.C7296c;
import p492U1.C7536a;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: W9.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8461D {
    /* JADX INFO: renamed from: a */
    public static final void m9084a(long j10, EnumC16673F0 enumC16673F0) {
        if (enumC16673F0 == EnumC16673F0.f53401Y) {
            if (C7536a.m7853h(j10) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (C7536a.m7854i(j10) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static C4256b m9085b(C7296c refHolder, SQLiteDatabase sqLiteDatabase) {
        AbstractC16544l.m18094g(refHolder, "refHolder");
        AbstractC16544l.m18094g(sqLiteDatabase, "sqLiteDatabase");
        C4256b c4256b = (C4256b) refHolder.f23104Z;
        if (c4256b != null && AbstractC16544l.m18089b(c4256b.f13904Y, sqLiteDatabase)) {
            return c4256b;
        }
        C4256b c4256b2 = new C4256b(sqLiteDatabase);
        refHolder.f23104Z = c4256b2;
        return c4256b2;
    }
}
