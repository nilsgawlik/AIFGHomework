- generate graph
    - outer corners
    - check visibility for each pair of nodes i,j
        - continue if i=j
        - intersect line l from i to j
            - for each obstacle, for each line m in obstacle
                - if l intersects m intersect is true
            else intersect is false
        - if not intersect: 
            - add edge to graph with euclidian distance
    - save graph as "base graph"
- when node changes or at start  
    - integrate current goal and position into graph
        - for both points
            - same as "check visibility for ..."
    - run a A* ag, save in "path"
    - post process path to make it more car-friendly
        - split each point into normal and tangent points
        - for normal and tangent move outwards
            - move out to specific tangent and normal distance
            - if collision at 2x the distance
                - shrink until it no longer collides
        - smooth path using divide and move
    - set current point to 0
- follow path
    - while distance to next point smaller than distance to current point
        - increase current point
    - calculate target point as current point + rounded weighted speed
    - use steering to follow target point



Problems:
 - steering will often get stuck on walls or in donuts

 x path following is really shitty
 x after explosion the path has to reset
 x path will often clip corners -> expand polygons for collision detection