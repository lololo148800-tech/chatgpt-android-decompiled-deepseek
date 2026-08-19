package p1071w0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: renamed from: w0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C20728Q {

    /* JADX INFO: renamed from: a */
    public Integer f65723a;

    /* JADX INFO: renamed from: a */
    public final Integer m21223a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.f65723a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f65723a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.f65723a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(unicodeChar) : num2;
    }
}
