package p999s;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1002s2.AbstractC19439b;
import p1002s2.InterfaceC19438a;
import p283L5.AbstractC4941g;
import p468T2.C7218j;
import p517V2.C7741b;
import p517V2.C7743d;
import p517V2.C7746g;
import p517V2.C7747h;
import p658b5.C11234e;
import p658b5.C11242m;
import p720e6.C13287b;
import p880m.AbstractC17123a;

/* JADX INFO: renamed from: s.y */
/* JADX INFO: loaded from: classes.dex */
public class C19388y {

    /* JADX INFO: renamed from: d */
    public static final int[] f61403d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61404a = 2;

    /* JADX INFO: renamed from: b */
    public View f61405b;

    /* JADX INFO: renamed from: c */
    public Object f61406c;

    public /* synthetic */ C19388y() {
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m20488a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C11234e) ((C13287b) this.f61406c).f42000Z).getClass();
        if (keyListener instanceof C7743d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7743d(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public void mo20357b(AttributeSet attributeSet, int i10) {
        switch (this.f61404a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f61405b;
                C11242m c11242mM12599G = C11242m.m12599G(absSeekBar.getContext(), attributeSet, f61403d, i10);
                Drawable drawableM12602C = c11242mM12599G.m12602C(0);
                if (drawableM12602C != null) {
                    if (drawableM12602C instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM12602C;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableM20491e = m20491e(animationDrawable.getFrame(i11), true);
                            drawableM20491e.setLevel(ErrorBoundaryKt.SAMPLING_RATE);
                            animationDrawable2.addFrame(drawableM20491e, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(ErrorBoundaryKt.SAMPLING_RATE);
                        drawableM12602C = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM12602C);
                }
                Drawable drawableM12602C2 = c11242mM12599G.m12602C(1);
                if (drawableM12602C2 != null) {
                    absSeekBar.setProgressDrawable(m20491e(drawableM12602C2, false));
                }
                c11242mM12599G.m12606H();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f61405b).getContext().obtainStyledAttributes(attributeSet, AbstractC17123a.f54740i, i10, 0);
                try {
                    boolean z6 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z6 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m20490d(z6);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public C7741b m20489c(InputConnection inputConnection, EditorInfo editorInfo) {
        C13287b c13287b = (C13287b) this.f61406c;
        if (inputConnection == null) {
            c13287b.getClass();
            inputConnection = null;
        } else {
            C11234e c11234e = (C11234e) c13287b.f42000Z;
            c11234e.getClass();
            if (!(inputConnection instanceof C7741b)) {
                inputConnection = new C7741b((EditText) c11234e.f34001Z, inputConnection, editorInfo);
            }
        }
        return (C7741b) inputConnection;
    }

    /* JADX INFO: renamed from: d */
    public void m20490d(boolean z6) {
        C7747h c7747h = (C7747h) ((C11234e) ((C13287b) this.f61406c).f42000Z).f34002o0;
        if (c7747h.f24424o0 != z6) {
            if (c7747h.f24423Z != null) {
                C7218j c7218jM7609a = C7218j.m7609a();
                C7746g c7746g = c7747h.f24423Z;
                c7218jM7609a.getClass();
                AbstractC4941g.m5558Q(c7746g, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c7218jM7609a.f22896a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c7218jM7609a.f22897b.remove(c7746g);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            c7747h.f24424o0 = z6;
            if (z6) {
                C7747h.m8008a(c7747h.f24422Y, C7218j.m7609a().m7611b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public Drawable m20491e(Drawable drawable, boolean z6) {
        if (drawable instanceof InterfaceC19438a) {
            ((AbstractC19439b) ((InterfaceC19438a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = m20491e(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f61406c) == null) {
                    this.f61406c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C19388y(AbsSeekBar absSeekBar) {
        this.f61405b = absSeekBar;
    }

    public C19388y(EditText editText) {
        this.f61405b = editText;
        this.f61406c = new C13287b(editText);
    }
}
