package p517V2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p594Y9.AbstractC9877e0;

/* JADX INFO: renamed from: V2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7744e extends AbstractC9877e0 {

    /* JADX INFO: renamed from: a */
    public final TextView f24417a;

    /* JADX INFO: renamed from: b */
    public final C7742c f24418b;

    /* JADX INFO: renamed from: c */
    public boolean f24419c = true;

    public C7744e(TextView textView) {
        this.f24417a = textView;
        this.f24418b = new C7742c(textView);
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: b */
    public final InputFilter[] mo8004b(InputFilter[] inputFilterArr) {
        if (!this.f24419c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C7742c) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            C7742c c7742c = this.f24418b;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7742c;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == c7742c) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: c */
    public final void mo8005c(boolean z6) {
        if (z6) {
            m8007e();
        }
    }

    @Override // p594Y9.AbstractC9877e0
    /* JADX INFO: renamed from: d */
    public final void mo8006d(boolean z6) {
        this.f24419c = z6;
        m8007e();
        TextView textView = this.f24417a;
        textView.setFilters(mo8004b(textView.getFilters()));
    }

    /* JADX INFO: renamed from: e */
    public final void m8007e() {
        TextView textView = this.f24417a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f24419c) {
            if (!(transformationMethod instanceof C7748i) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C7748i(transformationMethod);
            }
        } else if (transformationMethod instanceof C7748i) {
            transformationMethod = ((C7748i) transformationMethod).f24425Y;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
