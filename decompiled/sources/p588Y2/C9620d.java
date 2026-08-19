package p588Y2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import com.openai.chatgpt.R;
import p003A1.AbstractC0235c;
import p1072w2.C20791c;
import p594Y9.AbstractC9979u4;
import p658b5.C11241l;

/* JADX INFO: renamed from: Y2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9620d extends AbstractC0235c {

    /* JADX INFO: renamed from: d */
    public final boolean f28991d;

    /* JADX INFO: renamed from: e */
    public boolean f28992e;

    /* JADX INFO: renamed from: f */
    public C11241l f28993f;

    public C9620d(C9614S c9614s, C20791c c20791c, boolean z6) {
        super(c9614s, 2, c20791c);
        this.f28991d = z6;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7 A[Catch: RuntimeException -> 0x00f2, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00f2, blocks: (B:77:0x00e1, B:79:0x00e7), top: B:90:0x00e1 }] */
    /* JADX INFO: renamed from: p */
    public final C11241l m10164p(Context context) {
        int i10;
        C11241l c11241l;
        C11241l c11241l2;
        Animator animatorLoadAnimator;
        int iM10621c;
        if (this.f28992e) {
            return this.f28993f;
        }
        C9614S c9614s = (C9614S) this.f878b;
        boolean z6 = c9614s.f28948a == 2;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c9614s.f28950c;
        C9633q c9633q = abstractComponentCallbacksC11000a.f33138T0;
        int i11 = c9633q == null ? 0 : c9633q.f29040f;
        if (this.f28991d) {
            if (z6) {
                if (c9633q == null) {
                    i10 = 0;
                } else {
                    i10 = c9633q.f29038d;
                }
            } else if (c9633q == null) {
                i10 = 0;
            } else {
                i10 = c9633q.f29039e;
            }
        } else if (z6) {
            if (c9633q == null) {
                i10 = 0;
            } else {
                i10 = c9633q.f29036b;
            }
        } else if (c9633q == null) {
            i10 = 0;
        } else {
            i10 = c9633q.f29037c;
        }
        abstractComponentCallbacksC11000a.m11745O(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC11000a.f33134P0.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i10 == 0 && i11 != 0) {
                if (i11 == 4097) {
                    iM10621c = z6 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i11 == 8194) {
                    iM10621c = z6 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i11 == 8197) {
                    iM10621c = z6 ? AbstractC9979u4.m10621c(context, android.R.attr.activityCloseEnterAnimation) : AbstractC9979u4.m10621c(context, android.R.attr.activityCloseExitAnimation);
                } else if (i11 == 4099) {
                    iM10621c = z6 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i11 != 4100) {
                    iM10621c = -1;
                } else {
                    iM10621c = z6 ? AbstractC9979u4.m10621c(context, android.R.attr.activityOpenEnterAnimation) : AbstractC9979u4.m10621c(context, android.R.attr.activityOpenExitAnimation);
                }
                i10 = iM10621c;
            }
            if (i10 == 0) {
                c11241l2 = null;
            } else {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i10));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i10);
                        if (animationLoadAnimation != null) {
                            c11241l = new C11241l(animationLoadAnimation);
                            c11241l2 = c11241l;
                        } else {
                            c11241l2 = null;
                        }
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                            if (animatorLoadAnimator != null) {
                                c11241l = new C11241l();
                                c11241l.f34016Y = null;
                                c11241l.f34017Z = animatorLoadAnimator;
                                c11241l2 = c11241l;
                            }
                        } catch (RuntimeException e11) {
                            if (zEquals) {
                                throw e11;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i10);
                            if (animationLoadAnimation2 != null) {
                                c11241l2 = new C11241l(animationLoadAnimation2);
                            }
                            this.f28993f = c11241l2;
                            this.f28992e = true;
                            return c11241l2;
                        }
                        this.f28993f = c11241l2;
                        this.f28992e = true;
                        return c11241l2;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                    if (animatorLoadAnimator != null) {
                        c11241l = new C11241l();
                        c11241l.f34016Y = null;
                        c11241l.f34017Z = animatorLoadAnimator;
                        c11241l2 = c11241l;
                    } else {
                        c11241l2 = null;
                    }
                }
            }
        } else {
            c11241l2 = null;
        }
        this.f28993f = c11241l2;
        this.f28992e = true;
        return c11241l2;
    }
}
