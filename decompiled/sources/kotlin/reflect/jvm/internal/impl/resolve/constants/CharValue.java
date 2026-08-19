package kotlin.reflect.jvm.internal.impl.resolve.constants;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c9) {
        super(Character.valueOf(c9));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        String strValueOf;
        Integer numValueOf = Integer.valueOf(getValue().charValue());
        char cCharValue = getValue().charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : Separators.QUESTION;
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        AbstractC16544l.m18093f(charType, "getCharType(...)");
        return charType;
    }
}
