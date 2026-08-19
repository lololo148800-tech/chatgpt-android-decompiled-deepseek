package p544W9;

import ai.C10619j;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p324Mn.C5521B;
import p324Mn.C5554x;
import p330N4.C5640F;
import p330N4.C5641G;
import p330N4.C5670u;
import p523V9.AbstractC8160o6;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;

/* JADX INFO: renamed from: W9.c4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8615c4 {
    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m9266a(View view, C5640F c5640f, int i10, int i11, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, C5670u c5670u) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c5640f.f18321b.getTag(R.id.transition_position);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iRound = Math.round(f14 - translationX) + i10;
        int iRound2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        C5641G c5641g = new C5641G(view, c5640f.f18321b, iRound, iRound2, translationX, translationY);
        c5670u.m6098a(c5641g);
        objectAnimatorOfPropertyValuesHolder.addListener(c5641g);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(c5641g);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: b */
    public static final C5521B m9267b(C10619j c10619j, C5554x c5554x, C3430e c3430e) {
        try {
            LocalDate localDate = c5554x.f18006Y;
            int year = localDate.getYear();
            int monthValue = localDate.getMonthValue();
            int dayOfMonth = localDate.getDayOfMonth();
            Integer num = c10619j.f31504b;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = c10619j.f31505c;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = c10619j.f31506d;
            try {
                LocalDateTime localDateTimeM16829of = LocalDateTime.m16829of(year, monthValue, dayOfMonth, iIntValue, iIntValue2, num3 != null ? num3.intValue() : 0, 0);
                AbstractC16544l.m18091d(localDateTimeM16829of);
                return new C5521B(localDateTimeM16829of);
            } catch (DateTimeException e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (DateTimeException e11) {
            AbstractC8160o6.m8727b(c3430e, "Failed to format repeating date time schedule", e11, 4);
            return null;
        }
    }
}
